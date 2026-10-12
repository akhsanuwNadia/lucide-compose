package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudBackup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,15.251f)
                curveTo(22.042572f,13.9017105f,22.232956f,12.079052f,21.491728f,10.543437f)
                curveTo(20.750498f,9.007821f,19.204994f,8.023062f,17.5f,8.0f)
                lineTo(15.71f,8.0f)
                curveTo(14.9324465f,5.404519f,12.726898f,3.4908416f,10.04771f,3.0870297f)
                curveTo(7.368522f,2.6832175f,4.6969028f,3.861799f,3.1888797f,6.112794f)
                curveTo(1.6808566f,8.363789f,1.607285f,11.282897f,3.0f,13.607f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,11.0f)
                lineTo(7.0f,15.0f)
                lineTo(11.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,19.0f)
                curveTo(9.291291f,20.721722f,11.539428f,21.423986f,13.581139f,20.743416f)
                curveTo(15.622849f,20.062847f,17.0f,18.152151f,17.0f,16.0f)
                curveTo(17.0f,13.514719f,14.985281f,11.5f,12.5f,11.5f)
                curveTo(11.221302f,11.499074f,9.994638f,12.006287f,9.09f,12.91f)
                lineTo(7.0f,15.0f)
            }
}

public val LucideIcons.All.CloudBackupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudBackup: ImageVector
    @Composable get() = CloudBackupDefinition.asImageVector()
