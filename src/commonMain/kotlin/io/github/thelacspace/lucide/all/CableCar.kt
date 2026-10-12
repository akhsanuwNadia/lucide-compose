package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CableCar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(10.01f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.01f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                lineTo(22.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(17.0f,12.0f)
                lineTo(20.0f,12.0f)
                lineTo(20.0f,22.0f)
                lineTo(17.0f,22.0f)
                lineTo(7.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(4.0f,12.0f)
                lineTo(7.0f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(15.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,17.0f)
                lineTo(20.0f,17.0f)
            }
}

public val LucideIcons.All.CableCarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CableCar: ImageVector
    @Composable get() = CableCarDefinition.asImageVector()
