package com.oleksiy.tinycalculator;

import com.sun.faces.facelets.compiler.UIInstructions;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
@RequestScoped
public class Util {
    private static final Logger logger = Logger.getLogger("Util");

    public String printTree() {
        UIViewRoot root = FacesContext.getCurrentInstance().getViewRoot();
        printTree(root, 0);
        return "";
    }

    private void printTree(UIComponent element, int level) {
        logElement(level, element);
        for(UIComponent child : element.getChildren()) {
            printTree(child, level + 1);
        }
    }

    private void logElement(int level, UIComponent element) {
        String out = "";
        for (int i = 0; i < level; i++) {
            out += "------";
        }

        out += element.getClass().getSimpleName()
                + " - " + element.getFamily()
                + " - " + element.getRendererType() + element;

        logger.log(Level.INFO, out);
        if (element instanceof UIInstructions) {
            UIInstructions instructions = (UIInstructions) element;
            int childCount = instructions.getChildCount();
            logger.log(Level.INFO, "Child count is " + childCount);
        }
    }
}
