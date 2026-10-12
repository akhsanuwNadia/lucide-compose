package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampWallDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.929000854492188,18.628999710083008)
                curveTo(20.052104949951172,18.9371337890625,20.014347076416016,19.286264419555664,19.828214645385742,19.560955047607422)
                curveTo(19.642080307006836,19.835647583007812,19.33181381225586,20.0001220703125,19.0,20.0)
                lineTo(9.0,20.0)
                curveTo(8.668362617492676,19.99979019165039,8.358402252197266,19.83517837524414,8.172506332397461,19.5605411529541)
                curveTo(7.986609935760498,19.285903930664062,7.948962688446045,18.936969757080078,8.072000503540039,18.628999710083008)
                lineTo(10.072000503540039,13.628999710083008)
                curveTo(10.223675727844238,13.249349594116211,10.59117317199707,13.000259399414062,11.0,13.0)
                lineTo(17.0,13.0)
                curveTo(17.40882682800293,13.000259399414062,17.776325225830078,13.249349594116211,17.92799949645996,13.628999710083008)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,3.0)
                curveTo(7.104569435119629,3.0,8.0,3.895430564880371,8.0,5.0)
                lineTo(8.0,7.0)
                curveTo(8.0,8.104569435119629,7.104569435119629,9.0,6.0,9.0)
                lineTo(5.0,9.0)
                curveTo(4.4477152824401855,9.0,4.0,8.552285194396973,4.0,8.0)
                lineTo(4.0,4.0)
                curveTo(4.0,3.4477152824401855,4.4477152824401855,3.0,5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(12.0,6.0)
                curveTo(13.104569435119629,6.0,14.0,6.895430564880371,14.0,8.0)
                lineTo(14.0,13.0)
            }
}

public val LucideIcons.All.LampWallDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampWallDown: ImageVector
    @Composable get() = LampWallDownDefinition.asImageVector()
