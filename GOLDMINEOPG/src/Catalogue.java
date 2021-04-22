import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Catalogue
{

        private static Catalogue instance;
        private static Lock lock = new ReentrantLock();



        public static Catalogue getInstance() {

            if (instance == null) {
                synchronized (lock) {
                    if (instance == null)
                        instance = new Catalogue();
                }
            }
            return instance;
        }


}
