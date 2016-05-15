package com.achxis;

/**
 * Created by achxis-macbook on 5/15/16.
 */

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    /**
     * Implements BundleActivator.start().
     *
     * @param bundleContext - the framework context for the bundle.
     **/
    public void start(BundleContext bundleContext) {
        System.out.println("\n\n\n Hello World \n" +
                "************" +
                "\n\n\n");
    }

    /**
     * Implements BundleActivator.stop()
     *
     * @param bundleContext - the framework context for the bundle.
     **/
    public void stop(BundleContext bundleContext) {
        System.out.println("Goodbye World");
    }
}