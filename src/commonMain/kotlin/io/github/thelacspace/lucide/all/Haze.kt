package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Haze") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.2f,6.2f)
                lineTo(6.6f,7.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                lineTo(4.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,13.0f)
                lineTo(22.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.4f,7.6f)
                lineTo(18.8f,6.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(2.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,21.0f)
                lineTo(2.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,13.0f)
                curveTo(15.990151f,10.797844f,14.202178f,9.017849f,12.0f,9.017849f)
                curveTo(9.797822f,9.017849f,8.009849f,10.797844f,8.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                lineTo(12.0f,2.5f)
            }
}

public val LucideIcons.All.HazeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Haze: ImageVector
    @Composable get() = HazeDefinition.asImageVector()
