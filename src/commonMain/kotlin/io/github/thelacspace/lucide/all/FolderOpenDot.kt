package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderOpenDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                lineTo(7.45f,11.1f)
                curveTo(7.790522f,10.424228f,8.483282f,9.998509f,9.24f,10.0f)
                lineTo(20.0f,10.0f)
                curveTo(20.619192f,9.998914f,21.203968f,10.284684f,21.583574f,10.773867f)
                curveTo(21.963179f,11.263048f,22.094799f,11.90047f,21.94f,12.5f)
                lineTo(20.390001f,18.5f)
                curveTo(20.161676f,19.384304f,19.363304f,20.001602f,18.45f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.9f,2.9f,3.0f,4.0f,3.0f)
                lineTo(7.9300003f,3.0f)
                curveTo(8.599038f,3.0034614f,9.2220335f,3.3412297f,9.59f,3.9f)
                lineTo(10.41f,5.1000004f)
                curveTo(10.7779665f,5.6587706f,11.400962f,5.996539f,12.07f,6.0000005f)
                lineTo(18.0f,6.0000005f)
                curveTo(19.104568f,6.0000005f,20.0f,6.8954306f,20.0f,8.0f)
                lineTo(20.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,15.0f)
                curveTo(12.998398f,15.358331f,13.188645f,15.69013f,13.498705f,15.86976f)
                curveTo(13.8087635f,16.049389f,14.1912365f,16.049389f,14.501295f,15.86976f)
                curveTo(14.811355f,15.69013f,15.001602f,15.358331f,15.0f,15.0f)
                curveTo(15.001602f,14.641669f,14.811355f,14.30987f,14.501295f,14.13024f)
                curveTo(14.1912365f,13.95061f,13.8087635f,13.95061f,13.498705f,14.13024f)
                curveTo(13.188645f,14.30987f,12.998398f,14.641669f,13.0f,15.0f)
            }
}

public val LucideIcons.All.FolderOpenDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderOpenDot: ImageVector
    @Composable get() = FolderOpenDotDefinition.asImageVector()
