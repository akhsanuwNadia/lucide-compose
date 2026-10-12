package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Virus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,14.991f)
                lineTo(12.01f,14.991f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,22.0f)
                lineTo(11.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,2.0f)
                lineTo(11.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.99f,10.0f)
                lineTo(14.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,19.794f)
                lineTo(15.5f,18.061f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,4.205f)
                lineTo(15.5f,5.937f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.794f,16.5f)
                lineTo(18.062f,15.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.794f,7.5f)
                lineTo(18.062f,8.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(5.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                lineTo(2.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(19.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,13.0f)
                lineTo(22.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.206f,16.5f)
                lineTo(5.9379997f,15.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.206f,7.5f)
                lineTo(5.9379997f,8.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,19.794f)
                lineTo(8.5f,18.061f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,4.205f)
                lineTo(8.5f,5.937f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.0f)
                curveTo(4.9887824f,14.508317f,6.320516f,16.830912f,8.4909315f,18.08832f)
                curveTo(10.661347f,19.345726f,13.338653f,19.345726f,15.5090685f,18.08832f)
                curveTo(17.679483f,16.830912f,19.011217f,14.508317f,19.0f,12.0f)
                curveTo(19.011217f,9.491683f,17.679483f,7.1690884f,15.5090685f,5.9116807f)
                curveTo(13.338653f,4.654273f,10.661347f,4.654273f,8.4909315f,5.9116807f)
                curveTo(6.320516f,7.1690884f,4.9887824f,9.491683f,5.0f,12.0f)
            }
}

public val LucideIcons.All.VirusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Virus: ImageVector
    @Composable get() = VirusDefinition.asImageVector()
