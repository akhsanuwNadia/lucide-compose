package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Package2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.760000228881836,3.0)
                curveTo(17.520313262939453,2.994709014892578,18.21786880493164,3.420992612838745,18.559999465942383,4.099999904632568)
                lineTo(20.78999900817871,8.579000473022461)
                curveTo(20.927940368652344,8.8557710647583,20.99982261657715,9.160758972167969,20.999998092651367,9.470000267028809)
                lineTo(20.999998092651367,19.0)
                curveTo(20.999998092651367,20.104570388793945,20.104568481445312,21.0,18.999998092651367,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,9.472000122070312)
                curveTo(3.000020980834961,9.161665916442871,3.0722594261169434,8.85559368133545,3.2109999656677246,8.57800006866455)
                lineTo(5.449999809265137,4.099999904632568)
                curveTo(5.79052209854126,3.424227476119995,6.483282089233398,2.998508930206299,7.239999771118164,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.053999900817871,9.012999534606934)
                lineTo(20.946998596191406,9.012999534606934)
            }
}

public val LucideIcons.All.Package2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Package2: ImageVector
    @Composable get() = Package2Definition.asImageVector()
