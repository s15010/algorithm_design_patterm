/*
<applet code="Sample" width=300 height=300>
</applet>
*/
import java.applet.Applet;
import java.awt.*;

public class Sample extends Applet {
    final int WIDTH = 300;
    final int HEIGHT = 300;

    final int ORG_X = 20;
    final int ORG_Y = 280;

    int x[] = {50, 100, 150, 200, 250};
    int y[] = {4500, 11000, 13500, 21500, 24000};
    final int NUM = x.length;

    final int R = 3;

    double a, b;

public void init() {
    int A, B, C, D, E;
    A = B = C = D = E = 0;
    for (int i = 0; i < NUM; i++) {
        A += (y[i] * y[i]);
        B += (x[i] * y[i]);
        C += y[i];
        D += (x[i] * x[i]);
        E += x[i];
    }
    a = (NUM * B - C * E)/(-(E * E) + NUM * D);
    b = (C * D - B * E)/(-(E * E) + NUM * D);
}

public void paint(Graphics g) {
    g.setColor(new Color(0, 0, 0));
    g.drawLine(ORG_X, 0, ORG_X, HEIGHT);
    for (int y = 5000; y <= 25000; y+= 5000) {
        g.drawLine(ORG_X, ORG_Y - y / 100, ORG_X + 10, ORG_Y - y / 100);
    }
    g.drawLine(0, ORG_Y, WIDTH, ORG_Y);
    for (int x = 50; x <= 250; x+= 50) {
        g.drawLine(ORG_X + x, ORG_Y, ORG_X + x, ORG_Y - 10);
    }

    g.setColor(new Color(0, 0, 255));
    for (int i = 0; i < NUM; i++) {
        g.fillOval(ORG_X + x[i] - R, ORG_Y - y[i] / 100 - R, R * 2, R * 2);
    }

    int x1, y1, x2, y2;
    x1 = 0;
    y1 = (int)(a * x1 + b);
    x2 = WIDTH - ORG_X;
    y2 = (int)(a * x2 + b);
    g.setColor(new Color(255, 0, 0));
    g.drawLine(ORG_X + x1, ORG_Y - y1 / 100, ORG_X + x2, ORG_Y - y2 / 100);

    g.setColor(new Color(0, 0, 0));
    g.drawString("a = " + a, 40, 30);
    g.drawString("b = " + b, 40, 60);

    }
}





