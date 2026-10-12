package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LockKeyhole") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,16.0f)
                curveTo(10.998398f,16.358332f,11.188645f,16.69013f,11.498705f,16.86976f)
                curveTo(11.8087635f,17.049389f,12.1912365f,17.049389f,12.501295f,16.86976f)
                curveTo(12.811355f,16.69013f,13.001602f,16.358332f,13.0f,16.0f)
                curveTo(13.001602f,15.641669f,12.811355f,15.30987f,12.501295f,15.13024f)
                curveTo(12.1912365f,14.95061f,11.8087635f,14.95061f,11.498705f,15.13024f)
                curveTo(11.188645f,15.30987f,10.998398f,15.641669f,11.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                lineTo(19.0f,10.0f)
                lineTo(21.0f,10.0f)
                lineTo(21.0f,22.0f)
                lineTo(19.0f,22.0f)
                lineTo(5.0f,22.0f)
                lineTo(3.0f,22.0f)
                lineTo(3.0f,10.0f)
                lineTo(5.0f,10.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                lineTo(7.0f,7.0f)
                curveTo(7.0123105f,4.2473044f,9.247277f,2.0223107f,12.0f,2.0223107f)
                curveTo(14.752723f,2.0223107f,16.98769f,4.2473044f,17.0f,7.0f)
                lineTo(17.0f,10.0f)
            }
}

public val LucideIcons.All.LockKeyholeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LockKeyhole: ImageVector
    @Composable get() = LockKeyholeDefinition.asImageVector()
