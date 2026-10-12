package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Backpack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                curveTo(4.0f,7.790861f,5.790861f,6.0f,8.0f,6.0f)
                lineTo(16.0f,6.0f)
                curveTo(18.209139f,6.0f,20.0f,7.790861f,20.0f,10.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,10.0f)
                lineTo(16.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                lineTo(16.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(8.0f,16.0f)
                curveTo(8.0f,14.895431f,8.895431f,14.0f,10.0f,14.0f)
                lineTo(14.0f,14.0f)
                curveTo(15.104569f,14.0f,16.0f,14.895431f,16.0f,16.0f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,6.0f)
                lineTo(9.0f,4.0f)
                curveTo(9.0f,2.8954306f,9.895431f,2.0f,11.0f,2.0f)
                lineTo(13.0f,2.0f)
                curveTo(14.104569f,2.0f,15.0f,2.8954306f,15.0f,4.0f)
                lineTo(15.0f,6.0f)
            }
}

public val LucideIcons.All.BackpackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Backpack: ImageVector
    @Composable get() = BackpackDefinition.asImageVector()
