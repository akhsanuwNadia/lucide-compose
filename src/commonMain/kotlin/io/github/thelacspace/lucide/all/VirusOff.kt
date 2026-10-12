package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VirusOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.01f, 10f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 14.991f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 22f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 2f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 19.794f)
                lineToRelative(-1f, -1.733f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 4.205f)
                lineToRelative(-1f, 1.732f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.891f, 13.235f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.794f, 7.5f)
                lineToRelative(-1.732f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 13f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                horizontalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 13f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.206f, 16.5f)
                lineToRelative(1.732f, -1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.206f, 7.5f)
                lineToRelative(1.732f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.05f, 7.05f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.5f, 19.794f)
                lineToRelative(1f, -1.733f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.VirusOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VirusOff: ImageVector
    @Composable get() = VirusOffDefinition.asImageVector()
