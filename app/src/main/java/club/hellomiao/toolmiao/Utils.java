package club.hellomiao.toolmiao;

import java.util.Random;

/**
 * @author MiaoJiaxin
 * @name ToolMiao
 * @class name：club.hellomiao.toolmiao
 * @class :describe
 * @time 2020/1/3 23:01
 * @change :
 */
public class Utils {
        public static int generateRandomValue(int startValue, int endValue, int graduationValue) {
            double checkValue = (endValue-startValue)/graduationValue%1;
            if(checkValue==0) {
                int interval = (endValue-startValue)/graduationValue;
                long seed = System.currentTimeMillis();
                Random random = new Random(seed);
                int addValue = random.nextInt(interval+1)*graduationValue;
                return startValue+addValue;
            } else {
                return startValue;
            }
        }
}
