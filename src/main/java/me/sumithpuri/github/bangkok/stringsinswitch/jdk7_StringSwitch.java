package me.sumithpuri.github.bangkok.stringsinswitch;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri
 *
 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2015/05/java-se-7-whats-new-part-0304.html	
 * Blog Short URL		https://goo.gl/hFXXuw
 * Package Prefix 		me.sumithpuri.github.bangkok
 * Project Codename		bangkok
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sublicense,and/or sell copies of the Software, and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class jdk7_StringSwitch {  
    
	private static String day = "SAT";  
    
    public static void main(String[] args) {  
   
		demonstrate();
    }
    
    public static void demonstrate() {
    	
    	//this feature first came into java, in java 7 - it is very useful to switch using strings
    	switch(day) {  
		 
		      case "MON": { System.out.println("Monday"); break; }  
		      case "TUE": { System.out.println("Tuesday"); break; }  
		      case "SUN": { System.out.println("Sunday"); break; }  
		      case "SAT": { System.out.println("Saturday"); break; }  
    	}  
    }
}  