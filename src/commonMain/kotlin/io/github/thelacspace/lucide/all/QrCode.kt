package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("QrCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(7.0f,3.0f)
                lineTo(8.0f,3.0f)
                lineTo(8.0f,8.0f)
                lineTo(7.0f,8.0f)
                lineTo(4.0f,8.0f)
                lineTo(3.0f,8.0f)
                lineTo(3.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,8.0f)
                lineTo(20.0f,8.0f)
                lineTo(17.0f,8.0f)
                lineTo(16.0f,8.0f)
                lineTo(16.0f,3.0f)
                lineTo(17.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,16.0f)
                lineTo(7.0f,16.0f)
                lineTo(8.0f,16.0f)
                lineTo(8.0f,21.0f)
                lineTo(7.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,16.0f)
                lineTo(4.0f,16.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,16.0f)
                lineTo(18.0f,16.0f)
                curveTo(16.89543f,16.0f,16.0f,16.89543f,16.0f,18.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(21.0f,21.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,10.0f)
                curveTo(12.0f,11.104569f,11.104569f,12.0f,10.0f,12.0f)
                lineTo(7.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(3.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.01f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(12.0f,16.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(17.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                lineTo(21.0f,12.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,21.0f)
                lineTo(12.0f,20.0f)
            }
}

public val LucideIcons.All.QrCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.QrCode: ImageVector
    @Composable get() = QrCodeDefinition.asImageVector()
