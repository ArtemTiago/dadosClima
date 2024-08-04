/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log;

/**
 *
 * @author elisr
 */
public class Logger {
 
     public static void logAsJson(String message) {
        String json = "{\"log\":\"" + message + "\"}";
        log(json);
    }

    public static void logAsXml(String message) {
        String xml = "<log><message>" + message + "</message></log>";
        log(xml);
    }

    public static void log(String message) {
        // Implementação do log atual (arquivo, console, etc)
        System.out.println(message);
    }
}
