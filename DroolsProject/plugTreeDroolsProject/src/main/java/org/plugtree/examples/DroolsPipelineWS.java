package org.plugtree.examples;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author salaboy
 */
@WebService
public class DroolsPipelineWS {

    static ClassPathXmlApplicationContext ctx;
    static{
         ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public DroolsPipelineWS() {
       

    }

    @WebMethod
    public String execute(String inXml) {
        System.out.println("XML:" + inXml);
        String outXml = "";
        try {
            CamelContext camel = (CamelContext) ctx.getBean("MyCamelContext");
            ProducerTemplate template;
            template = camel.createProducerTemplate();
            template.start();
            template.sendBody("direct:start",inXml);

            ResultHandlerImpl resultHandler = (ResultHandlerImpl) ctx.getBean("resultHandler");
            for (int count = 0; resultHandler.getObject() == null && count < 10; count++) {
                System.out.println("Waiting for results...");
                Thread.sleep(500);

            }

            if (resultHandler.getObject() == null) {
                throw new IllegalStateException("Taking too much time to process");
            }

            outXml = (String) resultHandler.getObject();

        } catch (Exception ex) {
            Logger.getLogger(DroolsPipelineWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return outXml;
    }
}
