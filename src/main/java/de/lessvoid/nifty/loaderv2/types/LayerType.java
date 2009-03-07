package de.lessvoid.nifty.loaderv2.types;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.elements.render.ElementRenderer;
import de.lessvoid.nifty.loaderv2.NiftyFactory;
import de.lessvoid.nifty.tools.StringHelper;
import de.lessvoid.xml.xpp3.Attributes;

public class LayerType extends ElementType {
  public LayerType() {
    super();
  }

  public LayerType(final Attributes attributes) throws Exception {
    super(attributes);
  }

  public String output(final int offset) {
    return StringHelper.whitespace(offset) + "<layer> " + super.output(offset + 1);
  }

  protected ElementRenderer[] createElementRenderer(final Nifty nifty) {
    return NiftyFactory.getPanelRenderer();
  }
}