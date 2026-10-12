package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Magnet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,15.0)
                lineTo(16.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.3519999980926514,10.64799976348877)
                curveTo(1.8815034627914429,11.118566513061523,1.8815034627914429,11.88143253326416,2.3519999980926514,12.351999282836914)
                lineTo(4.6479997634887695,14.647998809814453)
                curveTo(5.118566989898682,15.11849594116211,5.88143253326416,15.11849594116211,6.351999759674072,14.647998809814453)
                lineTo(12.380999565124512,8.618999481201172)
                curveTo(12.916091918945312,8.079099655151367,13.699162483215332,7.866771697998047,14.433695793151855,8.062416076660156)
                curveTo(15.168230056762695,8.258061408996582,15.741937637329102,8.831768989562988,15.937582969665527,9.566303253173828)
                curveTo(16.13322639465332,10.300836563110352,15.920899391174316,11.083907127380371,15.380999565124512,11.618999481201172)
                lineTo(9.351999282836914,17.647998809814453)
                curveTo(8.881502151489258,18.118566513061523,8.881502151489258,18.881431579589844,9.351999282836914,19.351999282836914)
                lineTo(11.647998809814453,21.647998809814453)
                curveTo(12.118566513061523,22.11849594116211,12.881431579589844,22.11849594116211,13.351999282836914,21.647998809814453)
                lineTo(19.716999053955078,15.280998229980469)
                curveTo(22.73114585876465,12.239217758178711,22.719728469848633,7.333262920379639,19.69145965576172,4.305543422698975)
                curveTo(16.663188934326172,1.2778239250183105,11.757231712341309,1.2673002481460571,8.715999603271484,4.2820000648498535)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                lineTo(9.0,12.0)
            }
}

public val LucideIcons.All.MagnetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Magnet: ImageVector
    @Composable get() = MagnetDefinition.asImageVector()
