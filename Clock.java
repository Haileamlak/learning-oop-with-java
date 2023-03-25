
private class Clock extends Thread {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        int x1 = 0;// second arrow end points
        int y1 = 0;//
        int x2 = 0;//
        int y2 = 0;//

        int a1 = 0;// minute arrow end points
        int b1 = 0;//
        int a2 = 0;//
        int b2 = 0;//

        int c1 = 0;// hour arrow end points
        int d1 = 0;//
        int c2 = 0;//
        int d2 = 0;//

        int minx, miny, mina, minb, minc, mind;
        int maxx, maxy, maxa, maxb, maxc, maxd;
        clock = new JPanel();
        clock.setBounds(10, 10, 500, 690);
        clock.setBackground(Color.white);
        p1 = new JPanel();
        p1.setBounds(0, 0, 520, 710);
        // p1 = clock;
        p1.add(clock);
        bigPanel.add(p1);
        // bigPanel.setVisible(false);
        // bigPanel.setVisible(true);

        p1.setVisible(false);
        p1.setVisible(true);

        Graphics g = clock.getGraphics();
        Font defaultFont = g.getFont();

        LocalDate dateNow = LocalDate.now();

        g.setColor(new Color(0, 153, 204));
        g.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        g.drawString(deflang ? BahireCalc.get_greg_ወር(dateNow
                .getMonthValue())
                : dateNow.getMonth() + " "
                        + (defnum ? BahireCalc.toEthiopic(
                                dateNow.getDayOfMonth() + "")
                                : dateNow.getDayOfMonth())
                        + ", "
                        + (defnum ? BahireCalc
                                .toEthiopic(dateNow.getYear() + "")
                                : dateNow.getYear()),
                200,
                580);
        g.drawString((deflang ? BahireCalc.የሳምንቱ_ዕለታት[BahireCalc.ዕለት(
                new ቀን(dateNow.getDayOfMonth(), dateNow.getMonthValue(),
                        dateNow.getYear()))]
                : dateNow.getDayOfWeek()) + "", 300, 640);
        g.setFont(defaultFont);

        g.drawRoundRect(40, 520, 450, 150, 25, 25);// date and time enclosing rect
        g.drawOval(30, 30, 460, 460);// enclosing circle

        g.setFont(new Font("Power Geez Unicode1", Font.PLAIN, defaultFont.getSize() + 2));

        for (

                int i = 1; i <= 12; i++) {
            g.setColor(new Color(0, 153, 204));
            g.fillOval((int) (260 + (210 * Math.sin(i * 30 * (Math.PI / 180)))) - 15,
                    (int) (260 - (210 * Math.cos(i * 30 * (Math.PI / 180)))) - 15,
                    30, 30);
            g.setColor(Color.white);
            g.drawString(defnum ? BahireCalc.toEthiopic(i + "") : i + "",
                    (int) (260 + (210 * Math.sin(i * 30 * (Math.PI / 180))) - 5),
                    (int) (260 - (210 * Math.cos(i * 30 * (Math.PI / 180)))) + 5);
        }

        LocalTime t = LocalTime.now();

        for (double x = t.getSecond(), y = t.getMinute() + x / 60.0,
                z = t.getHour() % 12 + y
                        / 60.0; true; x = (x == 59) ? 0 : ++x, y = (y == 59)
                                ? 0
                                : y + 1.0 / 60.0, z = ((int) ((int) z
                                        + y / 60.0) >= 13) ? ((int) z
                                                + y / 60.0) - 12
                                                : (int) z + y / 60.0) {

            minx = x1 < x2 ? x1 - 2 : x2 - 2;
            mina = a1 < a2 ? a1 - 2 : a2 - 2;
            minc = c1 < c2 ? c1 - 2 : c2 - 2;
            maxx = x1 > x2 ? x1 + 2 : x2 + 2;
            maxa = a1 > a2 ? a1 + 2 : a2 + 2;
            maxc = c1 > c2 ? c1 + 2 : c2 + 2;

            miny = y1 < y2 ? y1 - 2 : y2 - 2;
            minb = b1 < b2 ? b1 - 2 : b2 - 2;
            mind = d1 < d2 ? d1 - 2 : d2 - 2;
            maxy = y1 > y2 ? y1 + 2 : y2 + 2;
            maxb = b1 > b2 ? b1 + 2 : b2 + 2;
            maxd = d1 > d2 ? d1 + 2 : d2 + 2;

            x1 = (int) (260 - (50 * Math.sin(x * 6 * (Math.PI / 180))));
            y1 = (int) (260 + (50 * Math.cos(x * 6 * (Math.PI / 180))));
            x2 = (int) (260 + (180 * Math.sin(x * 6 * (Math.PI / 180))));
            y2 = (int) (260 - (180 * Math.cos(x * 6 * (Math.PI / 180))));

            a1 = (int) (260 - (40 * Math.sin(y * 6 * (Math.PI / 180))));
            b1 = (int) (260 + (40 * Math.cos(y * 6 * (Math.PI / 180))));
            a2 = (int) (260 + (170 * Math.sin(y * 6 * (Math.PI / 180))));
            b2 = (int) (260 - (170 * Math.cos(y * 6 * (Math.PI / 180))));

            c1 = (int) (260 - (30 * Math.sin(z * 30 * (Math.PI / 180))));
            d1 = (int) (260 + (30 * Math.cos(z * 30 * (Math.PI / 180))));
            c2 = (int) (260 + (160 * Math.sin(z * 30 * (Math.PI / 180))));
            d2 = (int) (260 - (160 * Math.cos(z * 30 * (Math.PI / 180))));

            g.setColor(Color.white);
            g.fillRect(minx, miny, maxx - minx, maxy - miny);
            g.fillRect(mina, minb, maxa - mina, maxb - minb);
            g.fillRect(minc, mind, maxc - minc, maxd - mind);
            g.fillRect(50, 530, 150, 130);
            g.setColor(Color.black);

            g.fillOval(250, 250, 20, 20);// centre

            // sec
            g.setColor(Color.green);
            g.drawLine(x1, y1, x2, y2);
            g.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
            if (defnum)
                g.drawString(BahireCalc.toEthiopic(((int) x) + ""), 150, 650);
            else
                g.drawString(x < 10 ? "0" + (int) x : (int) x + "", 150, 650);

            // min
            g.setColor(Color.yellow);
            g.drawLine(a1, b1, a2, b2);
            g.setFont(new Font("Power Geez Unicode1", Font.BOLD, 60));
            if (defnum)
                g.drawString(BahireCalc.toEthiopic(((int) y) + ""), 60, 650);
            else
                g.drawString(y < 10 ? "0" + (int) y : (int) y + "", 60, 650);

            // hour
            g.setColor(Color.red);
            g.drawLine(c1, d1, c2, d2);
            if (defnum)
                g.drawString(BahireCalc.toEthiopic(((int) z) + ""), 60, 580);
            else
                g.drawString(z < 10 ? "0" + (int) z : (int) z + "", 60, 580);

            doNothing(1000);// 1 sec sleep

        }

    }

    public void doNothing(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Unexpected interrupt");
            System.exit(0);
        }
    }

}
