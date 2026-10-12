package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Calculator") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(18.0,2.0)
                lineTo(20.0,2.0)
                lineTo(20.0,22.0)
                lineTo(18.0,22.0)
                lineTo(6.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,2.0)
                lineTo(6.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(16.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,10.0)
                lineTo(16.010000228881836,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(12.010000228881836,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(8.010000228881836,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(12.010000228881836,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                lineTo(8.010000228881836,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.010000228881836,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(8.010000228881836,18.0)
            }
}

public val LucideIcons.All.CalculatorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Calculator: ImageVector
    @Composable get() = CalculatorDefinition.asImageVector()
