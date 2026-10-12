package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sailboat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                curveTo(4.790861129760742,22.0,3.0,20.209138870239258,3.0,18.0)
                curveTo(3.0,17.447715759277344,3.4477152824401855,17.0,4.0,17.0)
                lineTo(20.0,17.0)
                curveTo(20.552284240722656,17.0,21.0,17.447715759277344,21.0,18.0)
                curveTo(21.0,20.209138870239258,19.209138870239258,22.0,17.0,22.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.159000396728516,2.4600000381469727)
                curveTo(9.318937301635742,2.211054801940918,9.580910682678223,2.0457215309143066,9.87445068359375,2.008474111557007)
                curveTo(10.167991638183594,1.971226692199707,10.462956428527832,2.065890073776245,10.680000305175781,2.2669999599456787)
                lineTo(20.657001495361328,11.246999740600586)
                curveTo(20.970657348632812,11.52109146118164,21.081560134887695,11.96090316772461,20.93537712097168,12.35094928741455)
                curveTo(20.78919219970703,12.740995407104492,20.416540145874023,12.9995756149292,20.0,13.0)
                lineTo(4.0,13.0)
                curveTo(3.6284868717193604,13.000104904174805,3.2875375747680664,12.794242858886719,3.1146278381347656,12.465420722961426)
                curveTo(2.941718101501465,12.136597633361816,2.9653520584106445,11.739021301269531,3.1760001182556152,11.432999610900879)
                close()
            }
}

public val LucideIcons.All.SailboatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sailboat: ImageVector
    @Composable get() = SailboatDefinition.asImageVector()
