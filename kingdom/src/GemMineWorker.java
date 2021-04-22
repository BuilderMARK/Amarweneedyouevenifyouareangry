import kingdom.Gem;

public class GemMineWorker implements Runnable {

    private Gem gem;


    @Override
    public void run() {
        while(true) {

          // 1. will get a (maybe random) gem from the GemMine
          //      2.    gem.getValue();
              //  3.    = insert this into blocking que...
            //  .4 Make GemMineWorker the producer

            //    Thread.sleep(200);


        }
    }
}
