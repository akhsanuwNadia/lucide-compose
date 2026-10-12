package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gift") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,11.0f)
                lineTo(20.0f,19.0f)
                curveTo(20.0f,20.10457f,19.10457f,21.0f,18.0f,21.0f)
                lineTo(6.0f,21.0f)
                curveTo(4.8954306f,21.0f,4.0f,20.10457f,4.0f,19.0f)
                lineTo(4.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,7.0f)
                curveTo(6.1236525f,6.993845f,5.0111556f,5.8763614f,5.0111556f,4.5f)
                curveTo(5.0111556f,3.1236386f,6.1236525f,2.0061553f,7.5f,2.0f)
                curveTo(9.474232f,1.9656036f,11.25973f,3.9494915f,12.0f,7.0f)
                curveTo(12.74027f,3.9494915f,14.525768f,1.9656036f,16.5f,2.0f)
                curveTo(17.876348f,2.0061553f,18.988844f,3.1236386f,18.988844f,4.5f)
                curveTo(18.988844f,5.8763614f,17.876348f,6.993845f,16.5f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,7.0f)
                lineTo(20.0f,7.0f)
                lineTo(21.0f,7.0f)
                lineTo(21.0f,11.0f)
                lineTo(20.0f,11.0f)
                lineTo(4.0f,11.0f)
                lineTo(3.0f,11.0f)
                lineTo(3.0f,7.0f)
                lineTo(4.0f,7.0f)
                close()
            }
}

public val LucideIcons.All.GiftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gift: ImageVector
    @Composable get() = GiftDefinition.asImageVector()
