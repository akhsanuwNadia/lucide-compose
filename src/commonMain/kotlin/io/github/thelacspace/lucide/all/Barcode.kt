package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Barcode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,5.0)
                lineTo(8.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                lineTo(12.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,5.0)
                lineTo(17.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                lineTo(21.0,19.0)
            }
}

public val LucideIcons.All.BarcodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Barcode: ImageVector
    @Composable get() = BarcodeDefinition.asImageVector()
