package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VirusOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.01f,10.0f)
                lineTo(10.02f,10.0f)
            }
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
                moveTo(16.5f,19.794f)
                lineTo(15.5f,18.061f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,4.205f)
                lineTo(15.5f,5.937f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.891f,13.235f)
                curveTo(19.295553f,10.979808f,18.570847f,8.669386f,16.95073f,7.0492697f)
                curveTo(15.330614f,5.429154f,13.020192f,4.7044463f,10.765f,5.1089993f)
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
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
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
                moveTo(7.05f,7.05f)
                curveTo(4.337019f,9.787356f,4.346892f,14.202717f,7.072088f,16.927914f)
                curveTo(9.797284f,19.653109f,14.212645f,19.662983f,16.95f,16.95f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,19.794f)
                lineTo(8.5f,18.061f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.01f,12.0f)
            }
}

public val LucideIcons.All.VirusOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VirusOff: ImageVector
    @Composable get() = VirusOffDefinition.asImageVector()
