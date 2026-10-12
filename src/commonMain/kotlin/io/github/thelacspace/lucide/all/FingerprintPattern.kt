package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FingerprintPattern") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                curveTo(10.895431f,10.0f,10.0f,10.895431f,10.0f,12.0f)
                curveTo(10.0f,13.02f,9.9f,14.51f,9.74f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,13.12f)
                curveTo(14.0f,15.5f,14.0f,19.5f,13.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.29f,21.02f)
                curveTo(17.410002f,20.42f,17.720001f,18.720001f,17.79f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(2.0f,7.695696f,4.754301f,3.8743074f,8.837723f,2.513167f)
                curveTo(12.921144f,1.1520265f,17.417418f,2.5565567f,20.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                lineTo(2.01f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.8f,16.0f)
                curveTo(22.0f,14.0f,21.931f,10.646f,21.8f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,19.5f)
                curveTo(5.5f,18.0f,6.0f,15.0f,6.0f,12.0f)
                curveTo(5.9989896f,11.318868f,6.113966f,10.642535f,6.34f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.65f,22.0f)
                curveTo(8.86f,21.34f,9.099999f,20.68f,9.219999f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,6.8f)
                curveTo(10.857001f,5.727859f,13.145008f,5.7282257f,15.001667f,6.8009615f)
                curveTo(16.858324f,7.8736973f,18.001375f,9.85572f,18.0f,12.0f)
                lineTo(18.0f,14.0f)
            }
}

public val LucideIcons.All.FingerprintPatternDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FingerprintPattern: ImageVector
    @Composable get() = FingerprintPatternDefinition.asImageVector()
