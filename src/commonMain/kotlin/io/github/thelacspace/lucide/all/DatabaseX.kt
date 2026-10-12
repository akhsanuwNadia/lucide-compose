package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.322999954223633,13.744000434875488)
                curveTo(20.41367530822754,13.235142707824707,21.000003814697266,12.625388145446777,21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,13.126999855041504)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(17.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.0003662109375,12.88671588897705,4.177524566650391,13.727953910827637,6.215450763702393,14.297871589660645)
                curveTo(8.253376960754395,14.867788314819336,10.943273544311523,15.107993125915527,13.562999725341797,14.954000473022461)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.000361204147339,19.853612899780273,4.091615200042725,20.66675567626953,6.0004730224609375,21.23578643798828)
                curveTo(7.90933084487915,21.80481719970703,10.45501708984375,22.075847625732422,13.0,21.981000900268555)
            }
}

public val LucideIcons.All.DatabaseXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseX: ImageVector
    @Composable get() = DatabaseXDefinition.asImageVector()
