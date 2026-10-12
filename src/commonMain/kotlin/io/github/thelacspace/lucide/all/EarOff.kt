package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EarOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,18.5)
                curveTo(5.994391441345215,19.75415802001953,6.6602582931518555,20.915454864501953,7.7454657554626465,21.544158935546875)
                curveTo(8.830674171447754,22.172863006591797,10.169325828552246,22.172863006591797,11.254533767700195,21.544158935546875)
                curveTo(12.339741706848145,20.915454864501953,13.005608558654785,19.75415802001953,13.0,18.5)
                curveTo(13.0,16.93000030517578,13.920000076293945,15.979999542236328,15.039999961853027,15.039999961853027)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.5)
                curveTo(6.0,7.75,6.130000114440918,7.029999732971191,6.360000133514404,6.359999656677246)
            }
            lucidePath(strokeWidth) {
                moveTo(8.800000190734863,3.1500000953674316)
                curveTo(10.788618087768555,1.7731891870498657,13.377248764038086,1.614426851272583,15.519210815429688,2.7379069328308105)
                curveTo(17.66117286682129,3.861386775970459,19.002174377441406,6.081280708312988,19.0,8.5)
                curveTo(19.0,10.130000114440918,18.559999465942383,11.309999465942383,17.90999984741211,12.260000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5,6.0)
                curveTo(13.880711555480957,6.0,15.0,7.119287967681885,15.0,8.5)
                moveTo(10.0,13.0)
                curveTo(10.785799026489258,12.998360633850098,11.497823715209961,12.536717414855957,11.819999694824219,11.819999694824219)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.EarOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EarOff: ImageVector
    @Composable get() = EarOffDefinition.asImageVector()
