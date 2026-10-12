package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("OctagonPause") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,15.0)
                lineTo(10.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,15.0)
                lineTo(14.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.5859999656677246,16.72599983215332)
                curveTo(2.2109012603759766,16.351015090942383,2.0001134872436523,15.842390060424805,2.0,15.312000274658203)
                lineTo(2.0,8.687999725341797)
                curveTo(2.0001132488250732,8.157609939575195,2.2109012603759766,7.648985385894775,2.5859999656677246,7.2739996910095215)
                lineTo(7.27400016784668,2.5859994888305664)
                curveTo(7.648985385894775,2.2109010219573975,8.157609939575195,2.0001132488250732,8.687999725341797,2.0)
                lineTo(15.312000274658203,2.0)
                curveTo(15.842390060424805,2.0001134872436523,16.351015090942383,2.2109012603759766,16.72599983215332,2.5859999656677246)
                lineTo(21.413999557495117,7.27400016784668)
                curveTo(21.789098739624023,7.648985385894775,21.99988555908203,8.157609939575195,22.0,8.687999725341797)
                lineTo(22.0,15.312000274658203)
                curveTo(21.99988555908203,15.842390060424805,21.789098739624023,16.351015090942383,21.413999557495117,16.72599983215332)
                lineTo(16.72599983215332,21.413999557495117)
                curveTo(16.351015090942383,21.789098739624023,15.842390060424805,21.99988555908203,15.312000274658203,22.0)
                lineTo(8.687999725341797,22.0)
                curveTo(8.157609939575195,21.999887466430664,7.648984909057617,21.789098739624023,7.2739996910095215,21.413999557495117)
                close()
            }
}

public val LucideIcons.All.OctagonPauseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.OctagonPause: ImageVector
    @Composable get() = OctagonPauseDefinition.asImageVector()
