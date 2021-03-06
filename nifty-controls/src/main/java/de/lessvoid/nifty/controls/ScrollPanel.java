package de.lessvoid.nifty.controls;


/**
 * ScrollPanel.
 * @author void
 */
public interface ScrollPanel extends NiftyControl {

  /**
   * Set horizontal position.
   * @param xPos new position
   */
  void setHorizontalPos(float xPos);

  /**
   * Get the horizontal position.
   * @return xPos
   */
  float getHorizontalPos();

  /**
   * Set vertical position.
   * @param yPos new position
   */
  void setVerticalPos(float yPos);

  /**
   * Get the vertical position.
   * @return yPos
   */
  float getVerticalPos();

  /**
   * Show element vertical position.
   * @param elemCount element index
   */
  void showElementVertical(int elemCount);

  /**
   * Setup.
   * @param stepSizeX step size x
   * @param stepSizeY step size y
   * @param pageSizeX page size x
   * @param pageSizeY page size y
   * @param auto auto
   */
  void setUp(float stepSizeX, float stepSizeY, float pageSizeX, float pageSizeY, AutoScroll auto);

  /**
   * Set auto scroll mode.
   * @param auto auto scroll mode
   */
  void setAutoScroll(AutoScroll auto);

  /**
   * Get auto scroll mode.
   * @return auto scroll mode
   */
  AutoScroll getAutoScroll();

  /**
   * Step size x
   * @return step size x
   */
  void setStepSizeX(float stepSizeX);

  /**
   * Step size y
   * @param stepSizeY step size y
   */
  void setStepSizeY(float stepSizeY);

  /**
   * Page size x
   * @param pageSizeX page size x
   */
  void setPageSizeX(float pageSizeX);

  /**
   * Page size y
   * @param pageSizeY page sze y
   */
  void setPageSizeY(final float pageSizeY);

  /**
   * VerticalAlign
   * @author void
   */
  public enum VerticalAlign {
    top, center, bottom
  }

  /**
   * Autoscrollmode
   * @author void
   */
  public enum AutoScroll {
    TOP("top"),
    BOTTOM("bottom"),
    LEFT("left"),
    RIGHT("right"),
    TOP_LEFT("topLeft"),
    TOP_RIGHT("topRight"),
    BOTTOM_LEFT("bottomLeft"),
    BOTTOM_RIGHT("bottomRight"),
    OFF("off");

    private String param;

    private AutoScroll(final String param) {
      this.param = param;
    }

    public String getParam() {
      return param;
    }

    public static AutoScroll parse(final String param) {
      for (AutoScroll auto : values()) {
        if (auto.param.compareTo(param) == 0) {
          return auto;
        }
      }
      return AutoScroll.OFF;
    }
  }
}
