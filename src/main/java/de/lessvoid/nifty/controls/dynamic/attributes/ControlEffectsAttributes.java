package de.lessvoid.nifty.controls.dynamic.attributes;

import java.util.ArrayList;
import java.util.Collection;

import de.lessvoid.nifty.loaderv2.types.EffectsType;
import de.lessvoid.xml.xpp3.Attributes;

public class ControlEffectsAttributes {
  private Attributes attributes = new Attributes();
  private Collection < ControlEffectAttributes > onStartScreen = new ArrayList < ControlEffectAttributes >();
  private Collection < ControlEffectAttributes > onEndScreen = new ArrayList < ControlEffectAttributes >();
  private Collection < ControlEffectOnHoverAttributes > onHover = new ArrayList < ControlEffectOnHoverAttributes >();
  private Collection < ControlEffectAttributes > onClick = new ArrayList < ControlEffectAttributes >();
  private Collection < ControlEffectAttributes > onFocus = new ArrayList < ControlEffectAttributes >();
  private Collection < ControlEffectAttributes > onLostFocus = new ArrayList < ControlEffectAttributes >();
  private Collection < ControlEffectAttributes > onGetFocus = new ArrayList < ControlEffectAttributes >();
  private Collection < ControlEffectAttributes > onActive = new ArrayList < ControlEffectAttributes >();
  private Collection < ControlEffectAttributes > onCustom = new ArrayList < ControlEffectAttributes >();
  private Collection < ControlEffectAttributes > onShow = new ArrayList < ControlEffectAttributes >();
  private Collection < ControlEffectAttributes > onHide = new ArrayList < ControlEffectAttributes >();

  public Attributes getAttributes() {
    return attributes;
  }

  public void setAttribute(final String name, final String value) {
    attributes.set(name, value);
  }

  public void setOverlay(final String overlay) {
    attributes.set("overlay", overlay);
  }

  public void addOnStartScreen(final ControlEffectAttributes effectParam) {
    addOnStartScreen(effectParam);
  }

  public void addOnEndScreen(final ControlEffectAttributes effectParam) {
    addOnEndScreen(effectParam);
  }

  public void addOnHover(final ControlEffectOnHoverAttributes effectParam) {
    addOnHover(effectParam);
  }

  public void addOnClick(final ControlEffectAttributes effectParam) {
    addOnClick(effectParam);
  }

  public void addOnFocus(final ControlEffectAttributes effectParam) {
    addOnFocus(effectParam);
  }

  public void addOnLostFocus(final ControlEffectAttributes effectParam) {
    addOnLostFocus(effectParam);
  }

  public void addOnGetFocus(final ControlEffectAttributes effectParam) {
    addOnGetFocus(effectParam);
  }

  public void addOnActive(final ControlEffectAttributes effectParam) {
    addOnActive(effectParam);
  }

  public void addOnShow(final ControlEffectAttributes effectParam) {
    addOnShow(effectParam);
  }

  public void addOnHide(final ControlEffectAttributes effectParam) {
    addOnHide(effectParam);
  }

  public void addOnCustom(final ControlEffectAttributes effectParam) {
    addOnCustom(effectParam);
  }

  public EffectsType create() {
    EffectsType effectsType = new EffectsType();
    effectsType.initFromAttributes(attributes);
    addOnStartScreen(effectsType, onStartScreen);
    addOnEndScreen(effectsType, onEndScreen);
    addOnHover(effectsType, onHover);
    addOnClick(effectsType, onClick);
    addOnFocus(effectsType, onFocus);
    addOnLostFocus(effectsType, onLostFocus);
    addOnGetFocus(effectsType, onGetFocus);
    addOnActive(effectsType, onActive);
    addOnCustom(effectsType, onCustom);
    addOnShow(effectsType, onShow);
    addOnHide(effectsType, onHide);
    return effectsType;
  }

  private void addOnStartScreen(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnStartScreen(effectParam.create());
    }
  }

  private void addOnEndScreen(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnEndScreen(effectParam.create());
    }
  }

  private void addOnHover(final EffectsType effectsType, final Collection < ControlEffectOnHoverAttributes > effectCol) {
    for (ControlEffectOnHoverAttributes effectParam : effectCol) {
      effectsType.addOnHover(effectParam.create());
    }
  }

  private void addOnClick(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnClick(effectParam.create());
    }
  }

  private void addOnFocus(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnFocus(effectParam.create());
    }
  }

  private void addOnLostFocus(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnLostFocus(effectParam.create());
    }
  }

  private void addOnGetFocus(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnGetFocus(effectParam.create());
    }
  }

  private void addOnActive(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnActive(effectParam.create());
    }
  }

  private void addOnShow(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnShow(effectParam.create());
    }
  }

  private void addOnHide(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnHide(effectParam.create());
    }
  }

  private void addOnCustom(final EffectsType effectsType, final Collection < ControlEffectAttributes > effectCol) {
    for (ControlEffectAttributes effectParam : effectCol) {
      effectsType.addOnCustom(effectParam.create());
    }
  }

  public void refreshEffectsType(final EffectsType effectsType) {
    effectsType.getAttributes().refreshFromAttributes(getAttributes());
  }
}
