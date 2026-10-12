package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Castle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,5.0f)
                lineTo(10.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,5.0f)
                lineTo(14.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,21.0f)
                lineTo(15.0f,18.0f)
                curveTo(14.992614f,16.348383f,13.651634f,15.013387f,12.0f,15.013387f)
                curveTo(10.348366f,15.013387f,9.007386f,16.348383f,9.0f,18.0f)
                lineTo(9.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,3.0f)
                lineTo(18.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,5.0f)
                lineTo(6.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,11.0f)
                lineTo(2.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,9.0f)
                lineTo(22.0f,19.0f)
                curveTo(22.0f,20.10457f,21.10457f,21.0f,20.0f,21.0f)
                lineTo(4.0f,21.0f)
                curveTo(2.8954306f,21.0f,2.0f,20.10457f,2.0f,19.0f)
                lineTo(2.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,3.0f)
                lineTo(6.0f,11.0f)
            }
}

public val LucideIcons.All.CastleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Castle: ImageVector
    @Composable get() = CastleDefinition.asImageVector()
