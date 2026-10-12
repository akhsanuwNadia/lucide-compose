package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseBackup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(2.9970565f,13.140591f,4.934754f,14.183072f,8.0f,14.690001f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,9.3f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(2.9987004f,20.332409f,5.633961f,21.505445f,9.469999f,21.880001f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,16.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,20.0f)
                curveTo(14.291291f,21.721722f,16.539429f,22.423986f,18.581139f,21.743416f)
                curveTo(20.62285f,21.062847f,22.0f,19.152151f,22.0f,17.0f)
                curveTo(22.0f,14.514719f,19.985281f,12.5f,17.5f,12.5f)
                curveTo(16.17f,12.5f,14.96f,13.04f,14.09f,13.91f)
                lineTo(12.0f,16.0f)
            }
}

public val LucideIcons.All.DatabaseBackupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseBackup: ImageVector
    @Composable get() = DatabaseBackupDefinition.asImageVector()
