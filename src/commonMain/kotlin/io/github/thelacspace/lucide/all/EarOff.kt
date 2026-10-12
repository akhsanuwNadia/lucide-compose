package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EarOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,18.5f)
                curveTo(5.9943914f,19.754158f,6.6602583f,20.915455f,7.7454658f,21.544159f)
                curveTo(8.830674f,22.172863f,10.169326f,22.172863f,11.254534f,21.544159f)
                curveTo(12.339742f,20.915455f,13.005609f,19.754158f,13.0f,18.5f)
                curveTo(13.0f,16.93f,13.92f,15.98f,15.04f,15.04f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.5f)
                curveTo(6.0f,7.75f,6.13f,7.0299997f,6.36f,6.3599997f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.8f,3.15f)
                curveTo(10.788618f,1.7731892f,13.377249f,1.6144269f,15.519211f,2.737907f)
                curveTo(17.661173f,3.8613868f,19.002174f,6.0812807f,19.0f,8.5f)
                curveTo(19.0f,10.13f,18.56f,11.309999f,17.91f,12.26f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5f,6.0f)
                curveTo(13.880712f,6.0f,15.0f,7.119288f,15.0f,8.5f)
                moveTo(10.0f,13.0f)
                curveTo(10.785799f,12.998361f,11.497824f,12.536717f,11.82f,11.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.EarOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EarOff: ImageVector
    @Composable get() = EarOffDefinition.asImageVector()
