package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TreeDeciduous") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,19.0)
                curveTo(6.238401412963867,19.00394630432129,4.6815948486328125,17.8549747467041,4.1661200523376465,16.17047691345215)
                curveTo(3.6506454944610596,14.485980033874512,4.297865390777588,12.662551879882812,5.760000228881836,11.680000305175781)
                curveTo(4.861493110656738,10.55732250213623,4.7410783767700195,8.999320983886719,5.456406593322754,7.751913070678711)
                curveTo(6.17173433303833,6.504504680633545,7.577232837677002,5.821540832519531,9.0,6.03000020980835)
                lineTo(9.0,6.0)
                curveTo(8.995192527770996,4.925007343292236,9.565935134887695,3.9296092987060547,10.496113777160645,3.3907203674316406)
                curveTo(11.426291465759277,2.8518311977386475,12.573708534240723,2.8518311977386475,13.503886222839355,3.3907203674316406)
                curveTo(14.434064865112305,3.9296092987060547,15.004807472229004,4.925007343292236,15.0,6.0)
                lineTo(15.0,6.039999961853027)
                curveTo(16.422767639160156,5.831540584564209,17.828266143798828,6.514504432678223,18.543594360351562,7.761912822723389)
                curveTo(19.258922576904297,9.009321212768555,19.138507843017578,10.567322731018066,18.239999771118164,11.690000534057617)
                curveTo(19.69272804260254,12.675684928894043,20.332962036132812,14.493412017822266,19.818613052368164,16.17193603515625)
                curveTo(19.304264068603516,17.8504581451416,17.755558013916016,18.99742889404297,16.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(12.0,22.0)
            }
}

public val LucideIcons.All.TreeDeciduousDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TreeDeciduous: ImageVector
    @Composable get() = TreeDeciduousDefinition.asImageVector()
