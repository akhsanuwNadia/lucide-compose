package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,15.0f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,19.0f)
                lineTo(16.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.0221589f,13.651617f,7.045099f,14.986613f,12.0f,14.986613f)
                curveTo(16.9549f,14.986613f,20.97784f,13.651617f,21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(2.9997f,19.872393f,4.1386642f,20.701618f,6.1200686f,21.271574f)
                curveTo(8.101474f,21.841532f,10.729038f,22.095757f,13.318f,21.968f)
            }
}

public val LucideIcons.All.DatabaseMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseMinus: ImageVector
    @Composable get() = DatabaseMinusDefinition.asImageVector()
