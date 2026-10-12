package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Accessibility") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,4.0f)
                curveTo(14.998398f,4.3583307f,15.188645f,4.69013f,15.498705f,4.86976f)
                curveTo(15.8087635f,5.0493894f,16.191236f,5.0493894f,16.501295f,4.86976f)
                curveTo(16.811356f,4.69013f,17.001602f,4.3583307f,17.0f,4.0f)
                curveTo(17.001602f,3.641669f,16.811356f,3.3098698f,16.501295f,3.1302402f)
                curveTo(16.191236f,2.9506104f,15.8087635f,2.9506104f,15.498705f,3.1302402f)
                curveTo(15.188645f,3.3098698f,14.998398f,3.641669f,15.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,19.0f)
                lineTo(19.0f,12.0f)
                lineTo(13.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                lineTo(8.0f,5.0f)
                lineTo(13.5f,8.0f)
                lineTo(11.14f,11.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.24f,14.5f)
                curveTo(3.663591f,16.38565f,4.2492185f,18.433973f,5.735275f,19.729952f)
                curveTo(7.2213306f,21.02593f,9.33027f,21.327522f,11.12f,20.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.76f,17.5f)
                curveTo(14.336409f,15.614349f,13.750781f,13.566028f,12.264726f,12.270048f)
                curveTo(10.778669f,10.97407f,8.66973f,10.672479f,6.88f,11.5f)
            }
}

public val LucideIcons.All.AccessibilityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Accessibility: ImageVector
    @Composable get() = AccessibilityDefinition.asImageVector()
