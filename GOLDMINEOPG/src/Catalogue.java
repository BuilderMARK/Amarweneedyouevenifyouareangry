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
