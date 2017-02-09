package com.mydomain.sidebar;
import org.teavm.jso.dom.events.MouseEventTarget;
import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLButtonElement;
import org.teavm.jso.dom.html.HTMLElement;
public class Client {
	public static HTMLDocument document = HTMLDocument.current();
	public static HTMLElement block = document.createElement("div");
	public static HTMLElement sidebar = document.createElement("div");
	//Кнопки
    public static HTMLButtonElement arrangebutton = document.getElementById("ArnBtn").cast();
    public static HTMLButtonElement arrangebutton1 = document.getElementById("ArnBtn1").cast();
    public static HTMLButtonElement arrangebutton2 = document.getElementById("ArnBtn2").cast();
    public static HTMLButtonElement arrangebutton3 = document.getElementById("ArnBtn3").cast();
    public static HTMLButtonElement arrangebutton4 = document.getElementById("ArnBtn4").cast();
    public static HTMLButtonElement arrangebutton5 = document.getElementById("ArnBtn5").cast();
	//Квадратики вокруг фигур
	public static HTMLElement iteam = document.createElement("button");
	public static HTMLElement iteam1 = document.createElement("button");
	public static HTMLElement iteam2 = document.createElement("button");
	public static HTMLElement iteam3 = document.createElement("button");
	public static HTMLElement iteam4 = document.createElement("button");
	public static HTMLElement iteam5 = document.createElement("button");
	//Рисунок фигруы в панели фигур
	public static HTMLElement figurediv = document.createElement("div");
	public static HTMLElement figurediv1 = document.createElement("div");
	public static HTMLElement figurediv2= document.createElement("div");
	public static HTMLElement figurediv3 = document.createElement("div");
	public static HTMLElement figurediv4 = document.createElement("div");
	public static HTMLElement figurediv5 = document.createElement("div");
	//Область фигур на листе
	public static HTMLElement fig = document.createElement("g");
	public static HTMLElement fig1 = document.createElement("g");
	public static HTMLElement fig2 = document.createElement("g");
	public static HTMLElement fig3 = document.createElement("g");
	public static HTMLElement fig4 = document.createElement("g");
	public static HTMLElement fig5 = document.createElement("g");
	//Область рисования
	public static HTMLElement svg1 = document.createElement("svg");
	public static HTMLElement backgroundContainer1 = document.createElement("div");
	public static HTMLElement background1 = document.createElement("div");
    public static void main(String[] args) {
    	document.getBody().setAttribute("class", "geEditor");
    	//Кнопки
        ((MouseEventTarget) iteam.cast()).listenClick(evt -> txtBtn());
        ((MouseEventTarget) iteam1.cast()).listenClick(evt -> txtBtn1());
        ((MouseEventTarget) iteam2.cast()).listenClick(evt -> txtBtn2());
        ((MouseEventTarget) iteam3.cast()).listenClick(evt -> txtBtn3());
        ((MouseEventTarget) iteam4.cast()).listenClick(evt -> txtBtn4());
        ((MouseEventTarget) iteam5.cast()).listenClick(evt -> txtBtn5());
        //Картинки
    	image(figurediv, "background-position: 0% 0%;", iteam);
        image(figurediv1, "background-position: 30% 0%;", iteam1);
        image(figurediv2, "background-position: 60% 0%;", iteam2);
        image(figurediv3, "background-position: 0% 38%;", iteam3);
        image(figurediv4, "background-position: 31% 38%;", iteam4);
        image(figurediv5, "background-position: 60% 38%;", iteam5);
    	//Область вокруг картинки
    	iTem(iteam, "geItem", "overflow: hidden; width: 65px; height: 65px; padding: 1px;", "javascript: void(0);", sidebar);
        iTem(iteam1, "geItem", "overflow: hidden; width: 65px; height: 65px; padding: 1px;", "javascript: void(0);", sidebar);
        iTem(iteam2, "geItem", "overflow: hidden; width: 65px; height: 65px; padding: 1px;", "javascript: void(0);", sidebar);
        iTem(iteam3, "geItem", "overflow: hidden; width: 65px; height: 65px; padding: 1px;", "javascript: void(0);", sidebar);
        iTem(iteam4, "geItem", "overflow: hidden; width: 65px; height: 65px; padding: 1px;", "javascript: void(0);", sidebar);
        iTem(iteam5, "geItem", "overflow: hidden; width: 65px; height: 65px; padding: 1px;", "javascript: void(0);", sidebar);
        insert(sidebar, "geSidebar", "touch-action: none;", "", "", block);
        insert(block, "", "display: block;", "", "", null);
        //Рисунок фигур на листе
        //rect("100.6", "142.4", "144px", "72px", "", "", "#ffffff", "#000000", "1.2", "1.2 1.2", "all", fig);
        //Область фигур на листе
        insert(fig, "geG", "visibility: visible; cursor: move;", "", "translate(0.5,0.5)", svg1);
        insert(fig1, "geG1", "visibility: visible; cursor: move;", "", "translate(0.5,0.5)", svg1);
        insert(fig2, "geG2", "visibility: visible; cursor: move;", "", "translate(0.5,0.5)", svg1);
        insert(fig3, "geG3", "visibility: visible; cursor: move;", "", "translate(0.5,0.5)", svg1);
        insert(fig4, "geG4", "visibility: visible; cursor: move;", "", "translate(0.5,0.5)", svg1);
        insert(fig5, "geG5", "visibility: visible; cursor: move;", "", "translate(0.5,0.5)", svg1);
        //Область рисования
        insert(background1, "geBackgroundPage", "", "", "", backgroundContainer1);
        insert(svg1, "", "left: 100px; top: 0px; display: block; min-width: 800px; min-height: 500px; position: absolute; background-image: none;", "", "", backgroundContainer1);
        insert(backgroundContainer1, "geDiagramContainer geDiagramBackdrop", "right: 0px; left: 0px; top: 87px; bottom: 40px; touch-action: none; overflow: auto;", "0", "", null);
    }
    public static void image(HTMLElement Element, String bgpos, HTMLElement Child){
    	Element.setAttribute("style", bgpos);
    	Element.setAttribute("class", "bgimg");
    	Child.appendChild(Element);
    }
    
    public static HTMLElement rect(String X, String Y, String Width, String Height, String RX, String RY, String Fill, String Stroke, String Stroke_width, String Stroke_dasharray, String Pointer_events, HTMLElement Child){
    	HTMLElement figimg = document.createElement("rect");
    	figimg.setAttribute("class", "geRect");
    	figimg.setAttribute("x", X);
    	figimg.setAttribute("y", Y);
    	figimg.setAttribute("width", Width);
    	figimg.setAttribute("height", Height);
    	figimg.setAttribute("rx", RX);
    	figimg.setAttribute("ry", RY);
    	figimg.setAttribute("fill", Fill);
    	figimg.setAttribute("stroke", Stroke);
    	figimg.setAttribute("stroke-width", Stroke_width);
    	figimg.setAttribute("stroke-dasharray", Stroke_dasharray);
    	figimg.setAttribute("pointer_event", Pointer_events);
    	Child.appendChild(figimg);
    	return figimg;
    }
    
    public static HTMLElement rect1(String X, String Y, String Width, String Height, String RX, String RY, String Fill, String Stroke, String Stroke_width, String Stroke_dasharray, String Pointer_events, HTMLElement Child){
    	HTMLElement figimg = document.createElement("rect1");
    	figimg.setAttribute("class", "geRect1");
    	figimg.setAttribute("x", X);
    	figimg.setAttribute("y", Y);
    	figimg.setAttribute("width", Width);
    	figimg.setAttribute("height", Height);
    	figimg.setAttribute("rx", RX);
    	figimg.setAttribute("ry", RY);
    	figimg.setAttribute("fill", Fill);
    	figimg.setAttribute("stroke", Stroke);
    	figimg.setAttribute("stroke-width", Stroke_width);
    	figimg.setAttribute("stroke-dasharray", Stroke_dasharray);
    	figimg.setAttribute("pointer_event", Pointer_events);
    	Child.appendChild(figimg);
    	return figimg;
    }
    public static HTMLElement ellipse(String CX, String CY, String RX, String RY, String Fill, String Stroke, String Stroke_width, String Stroke_dasharray, String Pointer_events, HTMLElement Child){
    	HTMLElement figimg2 = document.createElement("ellipse");
    	figimg2.setAttribute("class", "geEllipse");
    	figimg2.setAttribute("cx", CX);
    	figimg2.setAttribute("cy", CY);
    	figimg2.setAttribute("rx", RX);
    	figimg2.setAttribute("ry", RY);
    	figimg2.setAttribute("fill", Fill);
    	figimg2.setAttribute("stroke", Stroke);
    	figimg2.setAttribute("stroke-width", Stroke_width);
    	figimg2.setAttribute("stroke-dasharray", Stroke_dasharray);
    	figimg2.setAttribute("pointer_event", Pointer_events);
    	Child.appendChild(figimg2);
    	return figimg2;
    }
    public static HTMLElement path(String D, String Fill, String Stroke, String Stroke_width, String Stroke_miterlimit, String Stroke_dasharray, String Pointer_events, HTMLElement Child){
    	HTMLElement figimg3 = document.createElement("path");
    	figimg3.setAttribute("class", "gePath");
    	figimg3.setAttribute("d", D);
    	figimg3.setAttribute("fill", Fill);
    	figimg3.setAttribute("stroke", Stroke);
    	figimg3.setAttribute("stroke-width", Stroke_width);
    	figimg3.setAttribute("stroke-miterlimit", Stroke_miterlimit);
    	figimg3.setAttribute("stroke-dasharray", Stroke_dasharray);
    	figimg3.setAttribute("pointer_event", Pointer_events);
    	Child.appendChild(figimg3);
    	return figimg3;
    }
    
    public static HTMLElement path1(String D, String Fill, String Stroke, String Stroke_width, String Stroke_miterlimit, String Stroke_dasharray, String Pointer_events, HTMLElement Child){
    	HTMLElement figimg3 = document.createElement("path1");
    	figimg3.setAttribute("class", "gePath1");
    	figimg3.setAttribute("d", D);
    	figimg3.setAttribute("fill", Fill);
    	figimg3.setAttribute("stroke", Stroke);
    	figimg3.setAttribute("stroke-width", Stroke_width);
    	figimg3.setAttribute("stroke-miterlimit", Stroke_miterlimit);
    	figimg3.setAttribute("stroke-dasharray", Stroke_dasharray);
    	figimg3.setAttribute("pointer_event", Pointer_events);
    	Child.appendChild(figimg3);
    	return figimg3;
    }
    
    public static HTMLElement path2(String D, String Fill, String Stroke, String Stroke_width, String Stroke_miterlimit, String Stroke_dasharray, String Pointer_events, HTMLElement Child){
    	HTMLElement figimg3 = document.createElement("path2");
    	figimg3.setAttribute("class", "gePath2");
    	figimg3.setAttribute("d", D);
    	figimg3.setAttribute("fill", Fill);
    	figimg3.setAttribute("stroke", Stroke);
    	figimg3.setAttribute("stroke-width", Stroke_width);
    	figimg3.setAttribute("stroke-miterlimit", Stroke_miterlimit);
    	figimg3.setAttribute("stroke-dasharray", Stroke_dasharray);
    	figimg3.setAttribute("pointer_event", Pointer_events);
    	Child.appendChild(figimg3);
    	return figimg3;
    }
    public static void iTem(HTMLElement Element, String Class, String Style, String Href, HTMLElement Child) {
        Element.setAttribute("class", Class);
        Element.setAttribute("style", Style);
        Element.setAttribute("href", Href);
        if (Child != null)
            Child.appendChild(Element);
        else
            document.getBody().appendChild(Element);
    }
    public static void insert(HTMLElement Element, String Class, String Style, String Tabindex, String Transform, HTMLElement Child) {
        Element.setAttribute("class", Class);
        Element.setAttribute("style", Style);
        Element.setAttribute("tabindex", Tabindex);
        Element.setAttribute("transform", Transform);
        if (Child != null)
            Child.appendChild(Element);
        else
            document.getBody().appendChild(Element);
    }
    public static void txtBtn() {
    	rect("100.6", "142.4", "144", "72", "0", "0", "#ffffff", "#000000", "1.2", "1.2 1.2", "all", fig);
    }
    public static void txtBtn1() {
    	rect1("250.6", "142.4", "144", "72", "10", "10", "#ffffff", "#000000", "1", "1 1", "all", fig1);
    }
    public static void txtBtn2() {
    	ellipse("500", "178", "72", "48", "#ffffff", "#000000", "1.2", "1.2 1.2", "all", fig2); 
    }
    public static void txtBtn3() {
    	path("M 183.6 406.4 L 212.4 334.4 L 327.6 334.4 L 298.8 406.4 Z", "#ffffff", "#000000", "1.2", "10", "1.2 1.2", "all", fig3);
    }
    public static void txtBtn4() {
    	path1("M 231.6 422.4 L 303.6 470.4 L 231.6 518.4 Z", "#ffffff", "#000000", "1.2", "10", "1.2 1.2", "all", fig4);
    }
    public static void txtBtn5() {
    	path2("M 431.6 341.6 C 431.6 316 503.6 316 503.6 341.6 L 503.6 399.2 C 503.6 424.8 431.6 424.8 431.6 399.2 Z", "#ffffff", "#000000", "1.2", "10", "1.2 1.2", "all", fig5);
    }
}

