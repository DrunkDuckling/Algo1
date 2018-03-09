/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo1;

import javax.lang.model.element.Element;

/**
 *
 * @author soere
 */
public interface PQ {
    public Element extractMin();
    public void insert(Element e);
}
