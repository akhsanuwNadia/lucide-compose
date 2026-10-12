package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicVocal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,7.601f)
                lineTo(5.006f,15.790999f)
                curveTo(4.7145767f,16.189095f,4.7570376f,16.74024f,5.106f,17.088999f)
                lineTo(5.923f,17.907f)
                curveTo(6.2773914f,18.261007f,6.8390293f,18.298193f,7.237f,17.994f)
                lineTo(15.09f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,21.174f)
                curveTo(15.5f,20.5f,14.372f,20.0f,13.0f,20.0f)
                curveTo(10.941999f,20.0f,9.0720005f,22.355999f,7.0f,22.0f)
                curveTo(4.928f,21.644f,4.225f,18.631f,5.5f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,7.0f)
                curveTo(10.991987f,8.791655f,11.943226f,10.450651f,13.493523f,11.3488f)
                curveTo(15.043819f,12.246948f,16.95618f,12.246948f,18.506477f,11.3488f)
                curveTo(20.056774f,10.450651f,21.008013f,8.791655f,21.0f,7.0f)
                curveTo(21.008013f,5.2083454f,20.056774f,3.5493488f,18.506477f,2.6512005f)
                curveTo(16.95618f,1.7530521f,15.043819f,1.7530521f,13.493523f,2.6512005f)
                curveTo(11.943226f,3.5493488f,10.991987f,5.2083454f,11.0f,7.0f)
            }
}

public val LucideIcons.All.MicVocalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicVocal: ImageVector
    @Composable get() = MicVocalDefinition.asImageVector()
