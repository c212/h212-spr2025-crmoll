/*
    Here is my (static) drawing for a red IU logo

    We will talk about scaling our drawings soon.
 */

import javax.swing.*;
import java.awt.*;

public class Indiana extends JComponent {
    int x, y;
    public Indiana(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void paintComponent(Graphics g) {
        g.setColor(new Color(185, 0, 0));
        g.fillRect(225,100, 50, 300);
        // makes |

        g.fillRect(200, 100, 100, 50);
        // top _

        g.fillRect(200, 400, 100, 50);
        // bottom _

        g.fillRect(150, 300, 200, 50);
        // middle -

        g.fillRect(100, 175, 100, 50);
        // middle left -

        g.fillRect(300, 175, 100, 50);
        // middle right -

        g.fillRect(325, 225, 50, 100);
        // middle right |

        g.fillRect(125, 225, 50, 100);
        // middle left |

        g.fillPolygon( new int[] {125,150,150},
                       new int[] {325,325,350},
                3
                        );
        // left triangle

        g.fillPolygon( new int[] {375,350,350},
                new int[] {325,325,350},
                3
        );
        // right triangle

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        int width = 500, height = 500;
        frame.setVisible(true);
        frame.setSize(width + 20, height + 40);
        Indiana iu = new Indiana(width, height);
        frame.add(iu);
    }
}
