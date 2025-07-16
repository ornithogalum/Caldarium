package com.bloomware.caldarium.extensions;
import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

@Extension
public class StringExtension {
    public static boolean isInt(@This String thiz) {
        try {
            Integer.parseInt(thiz);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
