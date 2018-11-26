public class SkyViewRunner {
    /*
    JESSE HAN
    MR FOLWELL
    PD 4/5 AP JAVA
    DONUT STEEL
     */

    public static void main(String[] args) {
        double[] scan = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.2, 1.6, 0.6, 0.9};
        double[] scan2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};

        SkyView sv1 = new SkyView(4, 3, scan);
        SkyView sv2 = new SkyView(3, 2, scan2);

        System.out.println(sv1);
        System.out.println(sv2);

        System.out.println("Average 1 " + sv1.getAverage(1, 3, 0, 2));
        System.out.println("Average 2 " + sv2.getAverage(0, 1, 0, 1));
    }
}
/*
    Like the legend of the phoenix
    All ends with beginnings
    What keeps the planet spinning (uh)
    The force of love beginning
    We've come too far to give up who we are
    So let's raise the bar and our cups to the stars
    She's up all night 'til the sun
    I'm up all night to get some
    She's up all night for good fun
    I'm up all night to get lucky
    We're up all night 'til the sun
    We're up all night to get some
    We're up all night for good fun
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    The present has no ribbon
    Your gift keeps on giving,
    What is this I'm feeling?
    If you wanna leave I'm with it (ah)
    We've come too far to give up who we are
    So let's raise the bar and our cups to the stars
    She's up all night 'til the sun
    I'm up all night to get some
    She's up all night for good fun
    I'm up all night to get lucky
    We're up all night 'til the sun
    We're up all night to get some
    We're up all night for good fun
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We've come too far to give up who we are
    So let's raise the bar and our cups to the stars
    She's up all night 'til the sun
    I'm up all night to get some
    She's up all night for good fun
    I'm up all night to get lucky
    We're up all night 'til the sun
    We're up all night to get some
    We're up all night for good fun
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
    We're up all night to get lucky
 */
