//package com.lga.batikdemo;
//
//import org.apache.batik.transcoder.Transcoder;
//import org.apache.batik.transcoder.TranscoderException;
//import org.apache.batik.transcoder.TranscoderInput;
//import org.apache.batik.transcoder.TranscoderOutput;
//import org.apache.batik.transcoder.image.PNGTranscoder;
//import org.apache.fop.svg.PDFTranscoder;
//
//import java.io.*;
//
//public class SvgUtil2 {
//    //svg文件转成
//    public static void convertSvgFile2Pdf(File svg, File pdf) throws IOException, TranscoderException {
//        InputStream in = new FileInputStream(svg);
//        OutputStream out = new FileOutputStream(pdf);
//        out = new BufferedOutputStream(out);
//        convert2Pdf(in, out);
//    }
//
//    public static void convert2Pdf(InputStream in, OutputStream out) throws IOException, TranscoderException {
//        Transcoder transcoder = new PDFTranscoder();
//        try {
//            TranscoderInput input = new TranscoderInput(in);
//            try {
//                TranscoderOutput output = new TranscoderOutput(out);
//                transcoder.transcode(input, output);
//            } finally {
//                out.close();
//            }
//        } finally {
//            in.close();
//        }
//    }
//
//    //svg转为png
//    public static void convertSvgFile2Png(File svg, File png) throws IOException, TranscoderException {
//        InputStream in = new FileInputStream(svg);
//        OutputStream out = new FileOutputStream(png);
//        out = new BufferedOutputStream(out);
//        convert2PNG(in, out);
//    }
//
//    public static void convert2PNG(InputStream in, OutputStream out) throws IOException, TranscoderException {
//        Transcoder transcoder = new PNGTranscoder();
//        try {
//            TranscoderInput input = new TranscoderInput(in);
//            try {
//                TranscoderOutput output = new TranscoderOutput(out);
//                transcoder.transcode(input, output);
//            } finally {
//                out.close();
//            }
//        } finally {
//            in.close();
//        }
//    }
//
//    //字符串转成pdf
//    public static void convertStr2Pdf(String svg, File pdf) throws IOException, TranscoderException {
//        InputStream in = new ByteArrayInputStream(svg.getBytes());
//        OutputStream out = new FileOutputStream(pdf);
//        out = new BufferedOutputStream(out);
//        convert2Pdf(in, out);
//    }
//}
