/* Class348_Sub31_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class Class348_Sub31_Sub2 extends Class348_Sub31 implements ImageProducer
{
    static int anInt9068;
    static int[] anIntArray9069 = new int[1];
    static int anInt9070;
    static int anInt9071;
    static int anInt9072;
    private Canvas aCanvas9073;
    static int anInt9074;
    private Image anImage9075;
    static int anInt9076;
    static int anInt9077;
    private ColorModel aColorModel9078;
    static int anInt9079;
    static int anInt9080;
    static int anInt9081;
    static Class357[][][] aClass357ArrayArrayArray9082;
    private ImageConsumer anImageConsumer9083;
    
    private final synchronized void method3015(int i, int i_0_, int i_1_,
					       int i_2_, int i_3_) {
	anInt9068++;
	if (anImageConsumer9083 != null) {
	    anImageConsumer9083.setPixels(i_1_, i_2_, i_3_, i, aColorModel9078,
					  (((Class348_Sub31) this)
					   .anIntArray6916),
					  i_2_ * (((Class348_Sub31) this)
						  .anInt6917) + i_1_,
					  ((Class348_Sub31) this).anInt6917);
	    anImageConsumer9083.imageComplete(2);
	    if (i_0_ != 25786)
		anIntArray9069 = null;
	}
    }
    
    public static void method3016(int i) {
	if (i != 65280)
	    method3016(-19);
	anIntArray9069 = null;
	aClass357ArrayArrayArray9082 = null;
    }
    
    public final synchronized void removeConsumer
	(ImageConsumer imageconsumer) {
	if (imageconsumer == anImageConsumer9083)
	    anImageConsumer9083 = null;
	anInt9081++;
    }
    
    public final void startProduction(ImageConsumer imageconsumer) {
	addConsumer(imageconsumer);
	anInt9076++;
    }
    
    private final synchronized void method3017(byte i) {
	anInt9071++;
	int i_4_ = -25 % ((i - -41) / 55);
	if (anImageConsumer9083 != null) {
	    anImageConsumer9083.setPixels(0, 0,
					  ((Class348_Sub31) this).anInt6917,
					  ((Class348_Sub31) this).anInt6920,
					  aColorModel9078,
					  (((Class348_Sub31) this)
					   .anIntArray6916),
					  0,
					  ((Class348_Sub31) this).anInt6917);
	    anImageConsumer9083.imageComplete(2);
	}
    }
    
    public final synchronized void addConsumer(ImageConsumer imageconsumer) {
	anInt9072++;
	anImageConsumer9083 = imageconsumer;
	imageconsumer.setDimensions(((Class348_Sub31) this).anInt6917,
				    ((Class348_Sub31) this).anInt6920);
	imageconsumer.setProperties(null);
	imageconsumer.setColorModel(aColorModel9078);
	imageconsumer.setHints(14);
    }
    
    public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
	anInt9080++;
	if (anImageConsumer9083 != imageconsumer)
	    return false;
	return true;
    }
    
    final void method3011(int i, int i_5_, int i_6_, Graphics graphics,
			  int i_7_, int i_8_, int i_9_, int i_10_) {
	if (i_7_ != -1)
	    method3011(-26, 63, -8, null, 101, 114, -111, 37);
	anInt9074++;
	method3015(i_6_, 25786, i_5_, i_10_, i_9_);
	Shape shape = graphics.getClip();
	graphics.clipRect(i_8_, i, i_9_, i_6_);
	graphics.drawImage(anImage9075, i_8_ - i_5_, -i_10_ + i, aCanvas9073);
	graphics.setClip(shape);
    }
    
    final void method3008(Canvas canvas, int i, int i_11_, int i_12_) {
	((Class348_Sub31) this).anInt6920 = i_12_;
	anInt9079++;
	((Class348_Sub31) this).anInt6917 = i;
	aCanvas9073 = canvas;
	((Class348_Sub31) this).anIntArray6916
	    = new int[(((Class348_Sub31) this).anInt6917
		       * ((Class348_Sub31) this).anInt6920)];
	aColorModel9078 = new DirectColorModel(32, 16711680, 65280, 255);
	if (i_11_ <= -42) {
	    anImage9075 = aCanvas9073.createImage(this);
	    method3017((byte) -117);
	    aCanvas9073.prepareImage(anImage9075, aCanvas9073);
	    method3017((byte) 86);
	    aCanvas9073.prepareImage(anImage9075, aCanvas9073);
	    method3017((byte) 51);
	    aCanvas9073.prepareImage(anImage9075, aCanvas9073);
	}
    }
    
    public final void requestTopDownLeftRightResend
	(ImageConsumer imageconsumer) {
	anInt9070++;
    }
}
