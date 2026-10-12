package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,4.0f)
                lineTo(15.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,16.0f)
                lineTo(15.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,9.0f)
                lineTo(10.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,9.0f)
                lineTo(22.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.8f,11.8f)
                lineTo(19.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,9.0f)
                lineTo(15.01f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.8f,6.2f)
                lineTo(19.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.2f,6.2f)
                lineTo(11.0f,5.0f)
            }
}

public val LucideIcons.All.WandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wand: ImageVector
    @Composable get() = WandDefinition.asImageVector()
