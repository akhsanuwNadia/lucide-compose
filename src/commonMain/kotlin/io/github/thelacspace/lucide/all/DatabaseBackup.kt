package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseBackup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(2.997056484222412,13.14059066772461,4.934753894805908,14.183072090148926,8.0,14.690000534057617)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,9.300000190734863)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(2.9987003803253174,20.332408905029297,5.633961200714111,21.50544548034668,9.469999313354492,21.880001068115234)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,16.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,20.0)
                curveTo(14.291291236877441,21.721721649169922,16.5394287109375,22.423986434936523,18.581138610839844,21.74341583251953)
                curveTo(20.62285041809082,21.062847137451172,22.0,19.152151107788086,22.0,17.0)
                curveTo(22.0,14.514719009399414,19.985280990600586,12.5,17.5,12.5)
                curveTo(16.170000076293945,12.5,14.960000038146973,13.039999961853027,14.09000015258789,13.90999984741211)
                lineTo(12.0,16.0)
            }
}

public val LucideIcons.All.DatabaseBackupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseBackup: ImageVector
    @Composable get() = DatabaseBackupDefinition.asImageVector()
