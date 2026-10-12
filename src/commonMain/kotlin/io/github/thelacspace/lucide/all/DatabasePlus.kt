package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabasePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,16.0f)
                lineTo(19.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.536f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,19.0f)
                lineTo(16.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.000089f,12.985326f,4.451706f,13.907819f,6.88355f,14.467971f)
                curveTo(9.315394f,15.028123f,12.417389f,15.154511f,15.1824f,14.8061f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(2.9997f,19.872393f,4.1386642f,20.701618f,6.1200686f,21.271574f)
                curveTo(8.101474f,21.841532f,10.729038f,22.095757f,13.318f,21.968f)
            }
}

public val LucideIcons.All.DatabasePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabasePlus: ImageVector
    @Composable get() = DatabasePlusDefinition.asImageVector()
