/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plugtree.examples;

import org.drools.runtime.pipeline.ResultHandler;

/**
 *
 * @author salaboy
 */
class ResultHandlerImpl  implements
        ResultHandler {
        Object object;

        public void handleResult(Object object) {
            this.object = object;
        }

        public Object getObject() {
            return this.object;
        }
}
