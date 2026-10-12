package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Zap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.914f,4.0f)
                curveTo(16.147038f,3.3396456f,15.8921585f,2.6059139f,15.299925f,2.232237f)
                curveTo(14.707691f,1.8585604f,13.935706f,1.94438f,13.44f,2.4390001f)
                lineTo(4.4399996f,11.439f)
                curveTo(4.0108447f,11.86788f,3.8823144f,12.513055f,4.1143475f,13.073655f)
                curveTo(4.3463807f,13.634256f,4.8932776f,13.99987f,5.5f,14.0f)
                lineTo(9.502f,14.0f)
                curveTo(9.66408f,14.000207f,9.816004f,14.078966f,9.909589f,14.211297f)
                curveTo(10.003175f,14.343629f,10.026811f,14.513114f,9.973f,14.666f)
                lineTo(8.086f,20.0f)
                curveTo(7.8528757f,20.660604f,8.108042f,21.3946f,8.700674f,21.768139f)
                curveTo(9.293307f,22.141676f,10.065574f,22.055273f,10.561001f,21.56f)
                lineTo(19.561f,12.559999f)
                curveTo(19.989569f,12.130897f,20.11758f,11.485944f,19.885382f,10.925691f)
                curveTo(19.653183f,10.3654375f,19.106464f,10.000129f,18.5f,10.0f)
                lineTo(14.503f,10.0f)
                curveTo(14.340494f,10.000232f,14.188013f,9.921474f,14.094142f,9.788822f)
                curveTo(14.000272f,9.656171f,13.976723f,9.486174f,14.031f,9.333f)
                close()
            }
}

public val LucideIcons.All.ZapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Zap: ImageVector
    @Composable get() = ZapDefinition.asImageVector()
