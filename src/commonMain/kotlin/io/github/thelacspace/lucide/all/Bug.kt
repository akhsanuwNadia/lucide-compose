package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,7.0f)
                curveTo(16.209139f,7.0f,18.0f,8.790861f,18.0f,11.0f)
                lineTo(18.0f,14.0f)
                curveTo(17.985228f,17.303234f,15.3032675f,19.973227f,12.0f,19.973227f)
                curveTo(8.6967325f,19.973227f,6.0147724f,17.303234f,6.0f,14.0f)
                lineTo(6.0f,11.0f)
                curveTo(6.0f,8.790861f,7.790861f,7.0f,10.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.12f,3.88f)
                lineTo(16.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                curveTo(21.002413f,18.862982f,19.324608f,17.101507f,17.19f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                curveTo(20.997658f,7.0332575f,19.470352f,8.74126f,17.45f,8.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,13.0f)
                lineTo(18.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                curveTo(2.997588f,18.862982f,4.675393f,17.101507f,6.81f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                curveTo(3.0023417f,7.0332575f,4.529649f,8.741261f,6.55f,8.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(2.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(9.88f,3.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,7.13f)
                lineTo(9.0f,6.0f)
                curveTo(8.995193f,4.9250073f,9.565935f,3.9296093f,10.496114f,3.3907204f)
                curveTo(11.426291f,2.8518312f,12.573709f,2.8518312f,13.503886f,3.3907204f)
                curveTo(14.434065f,3.9296093f,15.004807f,4.9250073f,15.0f,6.0f)
                lineTo(15.0f,7.13f)
            }
}

public val LucideIcons.All.BugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bug: ImageVector
    @Composable get() = BugDefinition.asImageVector()
